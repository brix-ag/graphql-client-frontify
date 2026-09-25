package ch.brix.gql.client.frontify.input_objects;

public class ClearCatalogRowInput extends ch.brix.gql.client.InputObject {
  /**
   * **BETA** The `id` of the `CatalogRow` to clear.
   */
  public ClearCatalogRowInput id(ch.brix.gql.client.frontify.scalars.IdScalar v) {
    values.put("id", v);
    return this;
  }
}
