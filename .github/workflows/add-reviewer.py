import json
import sys

filename = sys.argv[1]
with open(filename) as f:
  b = f.read()
d = json.loads(b)
rs = d['reviewers']
print(rs)
