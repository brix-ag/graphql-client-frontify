package ch.brix.gql.client.frontify.input_objects;

public class BrandQueryInput extends ch.brix.gql.client.InputObject {
  /**
   * Search term used to retrieve matched results.
   */
  public BrandQueryInput term(ch.brix.gql.client.frontify.scalars.StringScalar v) {
    values.put("term", v);
    return this;
  }
  /**
   * Sort order of matched results.
   */
  @ch.brix.gql.client.DefaultValue("RELEVANCE")
  public BrandQueryInput sortBy(ch.brix.gql.client.frontify.enums.BrandQuerySortByInput v) {
    values.put("sortBy", v);
    return this;
  }
  /**
   * **DEPRECATED** Specify the sources of the matched results. This field will be removed. Use `filter.sources` instead. | Date: 2023-07-01T00:00:00.000+00:00
   */
  @ch.brix.gql.client.DefaultValue("[EVERYWHERE]")
  public BrandQueryInput searchIn(java.util.List<ch.brix.gql.client.frontify.enums.BrandSearchQuerySource> v) {
    values.put("searchIn", v);
    return this;
  }
  /**
   * Use filters to reduce the set of matched results.
   */
  public BrandQueryInput filter(ch.brix.gql.client.frontify.input_objects.BrandQueryFilterInput v) {
    values.put("filter", v);
    return this;
  }
}
