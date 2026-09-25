package ch.brix.gql.client.frontify.input_objects;

public class UpdateCatalogInput extends ch.brix.gql.client.InputObject {
  /**
   * **BETA** The `id` of the `Catalog` to update.
   */
  public UpdateCatalogInput id(ch.brix.gql.client.frontify.scalars.IdScalar v) {
    values.put("id", v);
    return this;
  }
  /**
   * **BETA** The data to update on the `Catalog`.
   */
  public UpdateCatalogInput data(ch.brix.gql.client.frontify.input_objects.UpdateCatalogDataInput v) {
    values.put("data", v);
    return this;
  }
}
