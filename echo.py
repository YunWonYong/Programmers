import json

dictionary = json.loads(input())
path = dictionary['pull_request']['_links']['html']['href']

print(path)
