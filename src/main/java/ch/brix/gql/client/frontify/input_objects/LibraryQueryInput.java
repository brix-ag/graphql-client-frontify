package ch.brix.gql.client.frontify.input_objects;

public class LibraryQueryInput extends ch.brix.gql.client.InputObject {
  /**
   * **BETA** Sort order of the `Library` query result set.
   */
  public LibraryQueryInput sortBy(ch.brix.gql.client.frontify.enums.LibraryQuerySort v) {
    values.put("sortBy", v);
    return this;
  }
}
