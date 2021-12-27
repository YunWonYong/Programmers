import label

jsonData = label.getJson()
reviewer = 'branch ' + jsonData['requested_reviewer']['login']
label.addLabels(jsonData, reviewer)
