package ch.brix.gql.client.frontify.input_objects;

public class CreateCatalogRowTextCellInput extends ch.brix.gql.client.InputObject {
  /**
   * **BETA** The `id` of the text column where the cell is located.
   */
  public CreateCatalogRowTextCellInput columnId(ch.brix.gql.client.frontify.scalars.IdScalar v) {
    values.put("columnId", v);
    return this;
  }
  /**
   * **BETA** The value to set in the text cell. Null or empty string leaves the cell empty.
   */
  public CreateCatalogRowTextCellInput value(ch.brix.gql.client.frontify.scalars.StringScalar v) {
    values.put("value", v);
    return this;
  }
}
