import label

reviewer = 'branch ' + label.jsonData['requested_reviewer']['login']
label.addLabel(reviewer)
