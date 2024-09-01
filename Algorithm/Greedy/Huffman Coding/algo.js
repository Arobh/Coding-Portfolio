class Node {
  constructor(freq, char = null, left = null, right = null) {
    this.freq = freq;
    this.char = char;
    this.left = left;
    this.right = right;
  }
}

function buildHuffmanTree(text) {
  const freqMap = new Map();
  for (const char of text) {
    freqMap.set(char, (freqMap.get(char) || 0) + 1);
  }

  const heap = Array.from(freqMap.entries()).map(([char, freq]) => new Node(freq, char));
  heap.sort((a, b) => a.freq - b.freq);

  while (heap.length > 1) {
    const left = heap.shift();
    const right = heap.shift();
    const newNode = new Node(left.freq + right.freq, null, left, right);
    heap.unshift(newNode);
    heap.sort((a, b) => a.freq - b.freq);
  }

  return heap[0];
}

function buildCodes(node, prefix = '', codeMap = {}) {
  if (node.char) {
    codeMap[node.char] = prefix;
  } else {
    buildCodes(node.left, prefix + '0', codeMap);
    buildCodes(node.right, prefix + '1', codeMap);
  }
  return codeMap;
}

function huffmanEncoding(text) {
  const root = buildHuffmanTree(text);
  const huffmanCode = buildCodes(root);
  return huffmanCode;
}

const text = "huffman coding is a data compression algorithm";
const huffmanCode = huffmanEncoding(text);
for (const [char, code] of Object.entries(huffmanCode)) {
  console.log(`${char}: ${code}`);
}
