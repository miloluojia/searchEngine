package com.liujun.search.algorithm.trieTree;

import com.liujun.search.algorithm.ahoCorasick.pojo.MatcherBusi;
import org.junit.Test;

/**
 * 进行trie中文的字符的替换
 *
 * @author liujun
 * @version 0.0.1
 * @date 2019/04/21
 */
public class TestTrieTreeChina {

  @Test
  public void testTrieChina() {
    TrieTreeChina china = new TrieTreeChina();
    china.insert("中国");
    china.insert("中国人");
    china.insert("中国人民");

    MatcherBusi index = china.match("中国人民", 0);
    System.out.println("索引:" + index);
  }
}