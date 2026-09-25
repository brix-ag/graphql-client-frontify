package ch.brix.gql.client.frontify.input_objects;

public class RemoveCatalogInput extends ch.brix.gql.client.InputObject {
  /**
   * **BETA** The ID of the `Catalog` to be removed.
   */
  public RemoveCatalogInput id(ch.brix.gql.client.frontify.scalars.IdScalar v) {
    values.put("id", v);
    return this;
  }
}
