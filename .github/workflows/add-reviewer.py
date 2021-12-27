import label

jsonData = label.getJson()
reviewer = jsonData['requested_reviewer']['login']
label.addLabels(jsonData, [reviewer])
