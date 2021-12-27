import label

jsonData = label.getJson()
reviewer = 'branch ' + jsonData['requested_reviewer']['login']
label.removeLabel(jsonData, reviewer)
