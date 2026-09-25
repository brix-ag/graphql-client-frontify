package ch.brix.gql.client.frontify.input_objects;

public class CatalogWindowPaginationInput extends ch.brix.gql.client.InputObject {
  /**
   * **BETA** Number of items to return per page. Values below 1 become 1 and values above 50 become 50.
   */
  public CatalogWindowPaginationInput limit(ch.brix.gql.client.frontify.scalars.IntScalar v) {
    values.put("limit", v);
    return this;
  }
  /**
   * **BETA** One-indexed page number to return. Values below 1 become 1.
   */
  @ch.brix.gql.client.DefaultValue("1")
  public CatalogWindowPaginationInput page(ch.brix.gql.client.frontify.scalars.IntScalar v) {
    values.put("page", v);
    return this;
  }
}
