class Counter {
  constructor(id_list) {
    this.counter = new Map()
    id_list.map(x => this.counter.set(x, 0))
  }

  add(id) {
    const current = this.counter.get(id)
    const new_current = current + 1
    this.counter.set(id, new_current)
  }

  to_array() {
    return Array.from(this.counter.values())
  }
}

function solution(id_list, report, k) {
  const graph = new Map()
  id_list.map(x => graph.set(x, new Set()))

  report
    .map(x => x.split(' '))
    .map(pair => graph.get(pair[1]).add(pair[0]))

  const counter = new Counter(id_list)

  Array.from(graph.entries())
    .filter(pair => pair[1].size >= k)
    .map(pair => Array.from(pair[1]).map(x => counter.add(x)))

  return counter.to_array()
}
