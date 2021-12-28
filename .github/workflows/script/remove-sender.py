import label

sender = 'branch ' + label.jsonData['sender']['login']
label.removeLabel(sender)

labels = label.jsonData['pull_request']['labels']
print(labels)
print("number of labels : " + str(len(labels)))
if len(labels) == 1 and labels[0]['name'] == 'approve':
  label.removeLabel('approve')
  label.addLabel('merge')
