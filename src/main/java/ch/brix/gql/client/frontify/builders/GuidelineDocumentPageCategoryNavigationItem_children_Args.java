package ch.brix.gql.client.frontify.builders;

public class GuidelineDocumentPageCategoryNavigationItem_children_Args extends ch.brix.gql.client.ArgsBuilder {
  /**
   * **BETA**
   * Default value: 100
   */
  public GuidelineDocumentPageCategoryNavigationItem_children_Args limit(ch.brix.gql.client.frontify.scalars.IntScalar value) {
    _add_arg("limit", value);
    return this;
  }
  /**
   * **BETA**
   * Default value: 1
   */
  public GuidelineDocumentPageCategoryNavigationItem_children_Args page(ch.brix.gql.client.frontify.scalars.IntScalar value) {
    _add_arg("page", value);
    return this;
  }
}
