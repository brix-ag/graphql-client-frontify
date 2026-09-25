package ch.brix.gql.client.frontify.input_objects;

public class AccountQueryInput extends ch.brix.gql.client.InputObject {
  /**
   * Search term used to retrieve matched results.
   */
  public AccountQueryInput term(ch.brix.gql.client.frontify.scalars.StringScalar v) {
    values.put("term", v);
    return this;
  }
  /**
   * Sort order of matched results.
   */
  @ch.brix.gql.client.DefaultValue("RELEVANCE")
  public AccountQueryInput sortBy(ch.brix.gql.client.frontify.enums.AccountQuerySortByInput v) {
    values.put("sortBy", v);
    return this;
  }
  /**
   * Use filters to reduce the set of matched results.
   */
  public AccountQueryInput filter(ch.brix.gql.client.frontify.input_objects.AccountQueryFilterInput v) {
    values.put("filter", v);
    return this;
  }
}
