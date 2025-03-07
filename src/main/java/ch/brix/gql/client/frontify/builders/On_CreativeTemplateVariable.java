package ch.brix.gql.client.frontify.builders;

public class On_CreativeTemplateVariable extends ch.brix.gql.client.TypeBuilder {
  public On_CreativeTemplateVariable() {
    super(new ch.brix.gql.client.On("CreativeTemplateVariable"));
  }
  /**
   * **BETA** Key of the `CreativeTemplateVariable`.
   */
  public On_CreativeTemplateVariable key() {
    _add_field("key");
    return this;
  }
  /**
   * **BETA** Name of the `CreativeTemplateVariable`.
   */
  public On_CreativeTemplateVariable name() {
    _add_field("name");
    return this;
  }
  /**
   * **BETA** Description of the `CreativeTemplateVariable`.
   */
  public On_CreativeTemplateVariable description() {
    _add_field("description");
    return this;
  }
  /**
   * **BETA** Type of the `CreativeTemplateVariable`.
   */
  public On_CreativeTemplateVariable type() {
    _add_field("type");
    return this;
  }
  /**
   * **BETA** Value of the `CreativeTemplateVariable`. See `CreativeTemplateVariableType` for valid formats.
   */
  public On_CreativeTemplateVariable value() {
    _add_field("value");
    return this;
  }
  /**
   * **BETA** Number of template items connected to the `CreativeTemplateVariable`.
   */
  public On_CreativeTemplateVariable connectionCount() {
    _add_field("connectionCount");
    return this;
  }
}
