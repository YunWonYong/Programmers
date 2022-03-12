class Order {
  constructor(order) {
    this.order = order
  }

  helper(combinations, data, start, end, index) {
    if (index == data.length) {
      const newData = data.slice()
      newData.sort()
      combinations.push(newData.join(""))
    }
    else if (start <= end) {
      data[index] = this.order[start]
      this.helper(combinations, data, start+1, end, index+1)
      this.helper(combinations, data, start+1, end, index)
    }
  }

  generate(r) {
    const combinations = []
    const data = Array(r)
    this.helper(combinations, data, 0, this.order.length-1, 0)
    return combinations
  }
}

class Counter extends Map {
  count(combination) {
    if (this.get(combination))
      this.set(combination, this.get(combination) + 1)
    else
      this.set(combination, 1)
  }
}

function solution(orders, courses) {
  const counter = new Counter()

  for (let course of courses) {
    for (let order of orders) {
      let ord = new Order(order)
      let combinations = ord.generate(course)
      combinations.forEach(x => counter.count(x))
    }
  }

  const max = new Map()

  for (let course of courses) {
    max.set(course, 0)
    counter.forEach((v, k) => {
      if (k.length == course && max.get(course) < v)
        max.set(course, v)
    })
  }

  const answer = []

  for (let course of courses) {
    counter.forEach((v, k) => {
      if (v > 1 && k.length == course && v == max.get(course))
        answer.push(k)
    })
  }

  answer.sort()
  return answer
}
