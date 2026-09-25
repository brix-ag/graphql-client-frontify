package ch.brix.gql.client.frontify.input_objects;

public class CreateCatalogColumnInput extends ch.brix.gql.client.InputObject {
  /**
   * **BETA** Create a text `CatalogColumn`.
   */
  public CreateCatalogColumnInput text(ch.brix.gql.client.frontify.input_objects.CreateCatalogTextColumnInput v) {
    values.put("text", v);
    return this;
  }
  /**
   * **BETA** Create a link `CatalogColumn`.
   */
  public CreateCatalogColumnInput link(ch.brix.gql.client.frontify.input_objects.CreateCatalogLinkColumnInput v) {
    values.put("link", v);
    return this;
  }
}
