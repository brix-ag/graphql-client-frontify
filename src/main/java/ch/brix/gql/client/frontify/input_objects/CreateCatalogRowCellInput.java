package ch.brix.gql.client.frontify.input_objects;

public class CreateCatalogRowCellInput extends ch.brix.gql.client.InputObject {
  /**
   * **BETA** A text cell. Mutually exclusive with `link`.
   */
  public CreateCatalogRowCellInput text(ch.brix.gql.client.frontify.input_objects.CreateCatalogRowTextCellInput v) {
    values.put("text", v);
    return this;
  }
  /**
   * **BETA** A link cell. Mutually exclusive with `text`.
   */
  public CreateCatalogRowCellInput link(ch.brix.gql.client.frontify.input_objects.CreateCatalogRowLinkCellInput v) {
    values.put("link", v);
    return this;
  }
}
