package ch.brix.gql.client.frontify.input_objects;

public class LibraryPageAssetQueryInput extends ch.brix.gql.client.InputObject {
  /**
   * Search term used to retrieve matched results.
   */
  public LibraryPageAssetQueryInput term(ch.brix.gql.client.frontify.scalars.StringScalar v) {
    values.put("term", v);
    return this;
  }
}
