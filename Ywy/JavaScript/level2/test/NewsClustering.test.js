import NewsClustering from '../NewsClustering';

test(`"FRANCE", "french" is 16384`, () => {
    expect(new NewsClustering().solution("FRANCE", "french")).toBe(16384);
});

test(`"handshake", "shake hands" is 65536`, () => {
    expect(new NewsClustering().solution("handshake", "shake hands")).toBe(65536);
});