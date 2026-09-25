package ch.brix.gql.client.frontify.input_objects;

public class SetCatalogLinkCellInput extends ch.brix.gql.client.InputObject {
  /**
   * **BETA** The `id` of the row where the link cell is located.
   */
  public SetCatalogLinkCellInput rowId(ch.brix.gql.client.frontify.scalars.IdScalar v) {
    values.put("rowId", v);
    return this;
  }
  /**
   * **BETA** The `id` of the link column where the cell is located.
   */
  public SetCatalogLinkCellInput columnId(ch.brix.gql.client.frontify.scalars.IdScalar v) {
    values.put("columnId", v);
    return this;
  }
  /**
   * **BETA** Row ids of the target rows the cell points at. Empty list clears the cell.
   */
  public SetCatalogLinkCellInput linkedRowIds(java.util.List<ch.brix.gql.client.frontify.scalars.IdScalar> v) {
    values.put("linkedRowIds", v);
    return this;
  }
}
