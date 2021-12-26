import base64
import json
import sys
import urllib.parse
import urllib.request

filename = sys.argv[1]
with open(filename) as f:
  buf = f.read()
dic = json.loads(buf)
url = dic['pull_request']['_links']['issue']['href'] + '/labels'

username = 'vpark45@gmail.com'
password = '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'
toBeEncoded = username + ':' + password
auth = 'Basic ' + base64.b64encode(toBeEncoded.encode()).decode('ascii')
data = urllib.parse.urlencode({'labels': ['test']}).encode('ascii')

req = urllib.request.Request(url)
req.add_header('Accept', 'application/vnd.github.v3+json')
req.add_header('Authorization', auth)
req.add_header('Content-Length', len(data))
req.add_header('User-Agent', 'vpark45@gmail.com')

try:
  f = urllib.request.urlopen(req, data)
  print(f.read().decode())
except urllib.error.HTTPError as e:
  print(e.reason)

f.close()
