public class GroupAnagramsTest {

    @Test
  public void groupAnagramsTest() {
    GroupAnagrams groupAnagrams = new GroupAnagrams();
    List<List<String>> empty = groupAnagrams.groupAnagrams(new String[] {});
    assertTrue(empty.isEmpty());

    List<List<String>> anagrams =
        groupAnagrams.groupAnagrams(
            new String[] {"saco", "arresto", "programa", "rastreo", "caso"});
    assertTrue(anagrams.size() == 3);
    assertTrue(containsAll(anagrams, List.of("programa")));
    assertTrue(containsAll(anagrams, List.of("caso", "saco")));
    assertTrue(containsAll(anagrams, List.of("arresto", "rastreo")));
  }

  
}
