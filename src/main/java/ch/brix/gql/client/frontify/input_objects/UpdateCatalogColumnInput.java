package ch.brix.gql.client.frontify.input_objects;

public class UpdateCatalogColumnInput extends ch.brix.gql.client.InputObject {
  /**
   * **BETA** The `id` of the `CatalogColumn` to update.
   */
  public UpdateCatalogColumnInput id(ch.brix.gql.client.frontify.scalars.IdScalar v) {
    values.put("id", v);
    return this;
  }
  /**
   * **BETA** The data to update on the `CatalogColumn`.
   */
  public UpdateCatalogColumnInput data(ch.brix.gql.client.frontify.input_objects.UpdateCatalogColumnDataInput v) {
    values.put("data", v);
    return this;
  }
}
