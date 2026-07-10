package ch.brix.gql.client.frontify.input_objects;

public class LibraryCollectionQueryInput extends ch.brix.gql.client.InputObject {
  /**
   * Limit the result set by the search term.
   */
  public LibraryCollectionQueryInput term(ch.brix.gql.client.frontify.scalars.StringScalar v) {
    values.put("term", v);
    return this;
  }
}
