package ch.brix.gql.client.frontify.input_objects;

public class BrandQuerySourceInput extends ch.brix.gql.client.InputObject {
  /**
   * Specify the source type to search in.
   */
  public BrandQuerySourceInput type(ch.brix.gql.client.frontify.enums.BrandQuerySourceTypeInput v) {
    values.put("type", v);
    return this;
  }
  /**
   * Specify the Ids of the source type you want to search in. If no Ids are specified, a search will be performed on all accessible Ids of the type.
   */
  public BrandQuerySourceInput ids(java.util.List<ch.brix.gql.client.frontify.scalars.IdScalar> v) {
    values.put("ids", v);
    return this;
  }
}
