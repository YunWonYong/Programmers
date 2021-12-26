import base64
import json
import sys
import urllib.request

filename = sys.argv[1]
with open(filename) as f:
  b = f.read()
d = json.loads(b)
url = d['pull_request']['_links']['issue']['href'] + '/labels'

username = 'vpark45@gmail.com'
password = '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'
auth = 'Basic ' + base64.b64encode((username + ':' + password).encode()).decode()
# url = 'https://api.github.com/repos/nattybear/Programmers/issues/23/labels'
data = json.dumps({'labels' : ['test']}).encode()

req = urllib.request.Request(url, data)
req.add_header('Accept', 'application/vnd.github.v3+json')
req.add_header('Authorization', auth)

with urllib.request.urlopen(req) as f:
  b = f.read()

print(b)
