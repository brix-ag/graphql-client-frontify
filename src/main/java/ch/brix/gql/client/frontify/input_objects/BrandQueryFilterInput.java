package ch.brix.gql.client.frontify.input_objects;

public class BrandQueryFilterInput extends ch.brix.gql.client.InputObject {
  /**
   * Filter set of the matched results by single tag or list of tags.
   */
  public BrandQueryFilterInput hasTags(java.util.List<ch.brix.gql.client.frontify.scalars.StringScalar> v) {
    values.put("hasTags", v);
    return this;
  }
  /**
   * **BETA** Specify the sources to search in.
   */
  public BrandQueryFilterInput sources(java.util.List<ch.brix.gql.client.frontify.input_objects.BrandQuerySourceInput> v) {
    values.put("sources", v);
    return this;
  }
  /**
   * **BETA** Filter set of the matched results by the externalId.
   */
  public BrandQueryFilterInput externalId(ch.brix.gql.client.frontify.scalars.IdScalar v) {
    values.put("externalId", v);
    return this;
  }
}
