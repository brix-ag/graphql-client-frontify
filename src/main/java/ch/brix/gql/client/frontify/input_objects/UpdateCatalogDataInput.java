package ch.brix.gql.client.frontify.input_objects;

public class UpdateCatalogDataInput extends ch.brix.gql.client.InputObject {
  /**
   * **BETA** The new name for the `Catalog`.
   */
  public UpdateCatalogDataInput name(ch.brix.gql.client.frontify.scalars.StringScalar v) {
    values.put("name", v);
    return this;
  }
}
