import base64
import configparser
import json
import sys
import urllib.request

def getJson():
  with open(sys.argv[1]) as f:
    b = f.read()
  return json.loads(b)

def addLabels(jsonData, labelNames):
  config = configparser.ConfigParser()
  config.read('.label.ini')
  default = config['DEFAULT']
  username = default['username']
  password = default['password']
  auth = 'Basic ' + base64.b64encode((username + ':' + password).encode()).decode()
  data = json.dumps({'labels' : labelNames}).encode()
  url = jsonData['pull_request']['_links']['issue']['href'] + '/labels'
  req = urllib.request.Request(url, data)
  req.add_header('Accept', 'application/vnd.github.v3+json')
  req.add_header('Authorization', auth)
  with urllib.request.urlopen(req) as f:
    b = f.read()
  print(b)
