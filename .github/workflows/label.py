import configparser
import json
import subprocess
import sys

def getJson():
  with open(sys.argv[1]) as f:
    b = f.read()
  return json.loads(b)

def addLabels(jsonData, labelName):
  config = configparser.ConfigParser()
  config.read('.label.ini')
  default = config['DEFAULT']
  username = default['username']
  password = default['password']
  url = jsonData['pull_request']['_links']['issue']['href'] + '/labels'
  cmd = [
    'curl',
    '-X', 'POST',
    '-H', "'Accept: application/vnd.github.v3+json'",
    '-u', username + ':' + password,
    '-d', '"' + json.dumps({'labels' : [labelName]}) + '"',
    url
  ]
  subprocess.run(cmd)
