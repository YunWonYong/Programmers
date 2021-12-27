import configparser
import json
import subprocess
import sys

def addLabel(name):
  postData = makePostData(name)
  cmd = makeCmd('POST', url, postData=postData)  
  subprocess.run(cmd)

def getAuth():
  config = configparser.ConfigParser()
  config.read('.label.ini')
  default = config['DEFAULT']
  username = default['username']
  password = default['password']
  return username + ':' + password 

def getJson():
  with open(sys.argv[1]) as f:
    b = f.read()
  return json.loads(b)

def makeCmd(method, url, postData=None):
  cmd = [
    'curl',
    '-X', method,
    '-H', 'Accept: application/vnd.github.v3+json',
    '-u', getAuth()
  ]
  if postData:
    cmd.append('-d')
    cmd.append(postData)
  cmd.append(url)
  return cmd

def makePostData(name):
  return json.dumps({'labels' : [name]})

def removeLabel(name):
  cmd = makeCmd('DELETE', url + '/' + name)  
  subprocess.run(cmd)

jsonData = getJson()
url = jsonData['pull_request']['_links']['issue']['href'] + '/labels'
