package ch.brix.gql.client.frontify.builders;

public class RootQuery_guidelineNavigationItem_Args extends ch.brix.gql.client.ArgsBuilder {
  /**
   * **BETA** Id of any `Guideline` navigation item.
   * Default value: null
   */
  public RootQuery_guidelineNavigationItem_Args id(ch.brix.gql.client.frontify.scalars.IdScalar value) {
    _add_arg("id", value);
    return this;
  }
  /**
   * **BETA** Language code the navigation item is read in, e.g. `EN` or `DE`.
   * Default value: null
   */
  public RootQuery_guidelineNavigationItem_Args language(ch.brix.gql.client.frontify.scalars.StringScalar value) {
    _add_arg("language", value);
    return this;
  }
}
