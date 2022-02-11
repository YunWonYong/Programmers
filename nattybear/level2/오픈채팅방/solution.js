function solution(record) {
  const datas = record.map(parse)
  datas.forEach(assign)
  datas.forEach(print)
  return buffer
}

function parse(line) {
  let [command, id, name] = line.split(' ')
  return {
    command: command,
    id: id,
    name: name
  }
}

function assign(data) {
  if (["Enter", "Change"].includes(data.command))
    map.set(data.id, data.name)
}

function print(data) {
  let msg = ""
  switch (data.command) {
    case "Enter":
      msg = "님이 들어왔습니다."
      break
    case "Leave":
      msg = "님이 나갔습니다."
      break
    default:
      msg = ""
  }
  if (msg.length > 0)
    buffer.push(map.get(data.id) + msg)
}

const map = new Map()
const buffer = []
