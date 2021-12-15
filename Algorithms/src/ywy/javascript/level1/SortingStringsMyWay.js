const solution = (s) => {
    s = s.replace(/[^YP]/gi, "");
    return s.replace(/y/gi, "").length === s.replace(/p/gi, "").length;
};