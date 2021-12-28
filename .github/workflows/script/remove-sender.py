import label

sender = 'branch ' + label.jsonData['sender']['login']
label.removeLabel(sender)

labels = label.jsonData['pull_request']['labels']
if len(labels) == 1 and labels[0]['name'] == 'approve':
  label.removeLabel('approve')
  label.addLabel('merge')
