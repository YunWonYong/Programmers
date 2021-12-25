const readline = require('readline').createInterface({
  input: process.stdin,
  output: process.stdout
})

let json = ''

readline.question('', s => {
  json = JSON.parse(s)
  readline.close()
})

const https = require('https')

const data = JSON.stringify({
  labels: ["test"]
})

const username = 'vpark45@gmail.com'

const password = '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'

const auth = 'Basic ' + new Buffer(username + ':' + password).toString('base64')

const options = {
  hostname: 'api.github.com',
  port: 443,
  path: json['pull_request']['_links']['html']['href'] + '/labels',
  method: 'POST',
  headers: {
    'Accept': 'application/vnd.github.v3+json',
    'User-Agent': 'vpark45@gmail.com',
    'Authorization': auth,
    'Content-Length': data.length
  }
}

const req = https.request(options, res => {
  console.log(`statusCode: ${res.statusCode}`)

  res.on('data', d => {
    process.stdout.write(d)
  })
})

req.on('error', error => {
  console.error(error)
})

req.write(data)

req.end()
