package ch.brix.gql.client.frontify.builders;

public class On_GuidelineCoverPageNavigationItem extends ch.brix.gql.client.TypeBuilder {
  public On_GuidelineCoverPageNavigationItem() {
    super(new ch.brix.gql.client.On("GuidelineCoverPageNavigationItem"));
  }
  /**
   * **BETA**
   */
  public On_GuidelineCoverPageNavigationItem id() {
    _add_field("id");
    return this;
  }
  /**
   * **BETA**
   */
  public On_GuidelineCoverPageNavigationItem title() {
    _add_field("title");
    return this;
  }
  /**
   * **BETA**
   */
  public On_GuidelineCoverPageNavigationItem url() {
    _add_field("url");
    return this;
  }
}
