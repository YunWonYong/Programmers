import sys

filename = sys.argv[1]
with open(filename) as f:
  b = f.read()
j = json.loads(b)
url = j['pull_request']['_links']['issue']['href'] + '/labels'
print(url)
