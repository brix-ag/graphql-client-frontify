package ch.brix.gql.client.frontify.input_objects;

public class CreateCatalogRowLinkCellInput extends ch.brix.gql.client.InputObject {
  /**
   * **BETA** The `id` of the link column where the cell is located.
   */
  public CreateCatalogRowLinkCellInput columnId(ch.brix.gql.client.frontify.scalars.IdScalar v) {
    values.put("columnId", v);
    return this;
  }
  /**
   * **BETA** Row ids of the target rows the cell points at.
   */
  public CreateCatalogRowLinkCellInput linkedRowIds(java.util.List<ch.brix.gql.client.frontify.scalars.IdScalar> v) {
    values.put("linkedRowIds", v);
    return this;
  }
}
