import json
import sys

filename = sys.argv[1]
with open(filename) as f:
  buf = f.read()
dic = json.loads(buf)
path = dic['pull_request']['_links']['html']['href'] + '/labels'
print(path)
