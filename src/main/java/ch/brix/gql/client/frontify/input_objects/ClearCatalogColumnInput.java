package ch.brix.gql.client.frontify.input_objects;

public class ClearCatalogColumnInput extends ch.brix.gql.client.InputObject {
  /**
   * **BETA** The `id` of the `CatalogColumn` to clear.
   */
  public ClearCatalogColumnInput id(ch.brix.gql.client.frontify.scalars.IdScalar v) {
    values.put("id", v);
    return this;
  }
}
