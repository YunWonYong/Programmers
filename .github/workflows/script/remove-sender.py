import label

sender = 'branch ' + label.jsonData['sender']['login']
label.removeLabel(sender)
print(label.jsonData['labels'])
