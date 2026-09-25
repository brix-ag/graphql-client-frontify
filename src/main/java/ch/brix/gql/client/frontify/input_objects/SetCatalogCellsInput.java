package ch.brix.gql.client.frontify.input_objects;

public class SetCatalogCellsInput extends ch.brix.gql.client.InputObject {
  /**
   * **BETA** Cells to set; each entry is either a `text` or a `link` cell.
   */
  public SetCatalogCellsInput cells(java.util.List<ch.brix.gql.client.frontify.input_objects.SetCatalogCellInput> v) {
    values.put("cells", v);
    return this;
  }
}
