package ch.brix.gql.client.frontify.input_objects;

public class CreateCatalogTextColumnInput extends ch.brix.gql.client.InputObject {
  /**
   * **BETA** The `id` of the `Catalog` in which to create the text column.
   */
  public CreateCatalogTextColumnInput catalogId(ch.brix.gql.client.frontify.scalars.IdScalar v) {
    values.put("catalogId", v);
    return this;
  }
  /**
   * **BETA** The name of the new `CatalogTextColumn`.
   */
  public CreateCatalogTextColumnInput name(ch.brix.gql.client.frontify.scalars.StringScalar v) {
    values.put("name", v);
    return this;
  }
  /**
   * **BETA** The position of the new `CatalogTextColumn`.
   */
  public CreateCatalogTextColumnInput position(ch.brix.gql.client.frontify.scalars.IntScalar v) {
    values.put("position", v);
    return this;
  }
}
