package ch.brix.gql.client.frontify.input_objects;

public class SetCatalogCellInput extends ch.brix.gql.client.InputObject {
  /**
   * **BETA** Set a text cell.
   */
  public SetCatalogCellInput text(ch.brix.gql.client.frontify.input_objects.SetCatalogTextCellInput v) {
    values.put("text", v);
    return this;
  }
  /**
   * **BETA** Set a link cell.
   */
  public SetCatalogCellInput link(ch.brix.gql.client.frontify.input_objects.SetCatalogLinkCellInput v) {
    values.put("link", v);
    return this;
  }
}
