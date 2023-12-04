package ch.brix.gql.client.frontify.builders;

public class On_License extends ch.brix.gql.client.TypeBuilder {
  public On_License() {
    super(new ch.brix.gql.client.On("License"));
  }
  /**
   * `License` id.
   */
  public On_License id() {
    _add_field("id");
    return this;
  }
  /**
   * `License` title.
   */
  public On_License title() {
    _add_field("title");
    return this;
  }
  /**
   * `License` terms.
   */
  public On_License license() {
    _add_field("license");
    return this;
  }
  /**
   * `License` is applied to new assets by default.
   */
  public On_License addByDefault() {
    _add_field("addByDefault");
    return this;
  }
  /**
   * `License` requires `User` to accept terms before download.
   */
  public On_License requireConsensus() {
    _add_field("requireConsensus");
    return this;
  }
}
