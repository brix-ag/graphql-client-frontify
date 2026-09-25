package ch.brix.gql.client.frontify.builders;

public class Guideline_navigation_Args extends ch.brix.gql.client.ArgsBuilder {
  /**
   * **BETA**
   * Default value: null
   */
  public Guideline_navigation_Args language(ch.brix.gql.client.frontify.scalars.StringScalar value) {
    _add_arg("language", value);
    return this;
  }
  /**
   * **BETA**
   * Default value: 100
   */
  public Guideline_navigation_Args limit(ch.brix.gql.client.frontify.scalars.IntScalar value) {
    _add_arg("limit", value);
    return this;
  }
  /**
   * **BETA**
   * Default value: 1
   */
  public Guideline_navigation_Args page(ch.brix.gql.client.frontify.scalars.IntScalar value) {
    _add_arg("page", value);
    return this;
  }
}
