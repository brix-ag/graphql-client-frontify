package ch.brix.gql.client.frontify.input_objects;

public class CreateCatalogLinkColumnInput extends ch.brix.gql.client.InputObject {
  /**
   * **BETA** The `id` of the `Catalog` in which to create the link column.
   */
  public CreateCatalogLinkColumnInput catalogId(ch.brix.gql.client.frontify.scalars.IdScalar v) {
    values.put("catalogId", v);
    return this;
  }
  /**
   * **BETA** The name of the new `CatalogLinkColumn`.
   */
  public CreateCatalogLinkColumnInput name(ch.brix.gql.client.frontify.scalars.StringScalar v) {
    values.put("name", v);
    return this;
  }
  /**
   * **BETA** The position of the new `CatalogLinkColumn`.
   */
  public CreateCatalogLinkColumnInput position(ch.brix.gql.client.frontify.scalars.IntScalar v) {
    values.put("position", v);
    return this;
  }
  /**
   * **BETA** The `id` of the target `Catalog` linked by the new `CatalogLinkColumn`.
   */
  public CreateCatalogLinkColumnInput targetCatalogId(ch.brix.gql.client.frontify.scalars.IdScalar v) {
    values.put("targetCatalogId", v);
    return this;
  }
}
