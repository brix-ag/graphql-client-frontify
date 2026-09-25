package ch.brix.gql.client.frontify.builders;

public class On_AssetProvenance extends ch.brix.gql.client.TypeBuilder {
  public On_AssetProvenance() {
    super(new ch.brix.gql.client.On("AssetProvenance"));
  }
  /**
   * **BETA** Whether a credential was found, absent, could not be read, is still being extracted, or cannot be extracted for this file.
   */
  public On_AssetProvenance state() {
    _add_field("state");
    return this;
  }
  /**
   * **BETA** How the content was generated, derived from the credential's declared source types.
   */
  public On_AssetProvenance contentOrigin() {
    _add_field("contentOrigin");
    return this;
  }
  /**
   * **BETA** Whether the credential itself could be confirmed.
   */
  public On_AssetProvenance certStatus() {
    _add_field("certStatus");
    return this;
  }
  /**
   * **BETA** Organization the signing certificate was issued to, as its subject.
   */
  public On_AssetProvenance certSubject() {
    _add_field("certSubject");
    return this;
  }
  /**
   * **BETA** Name of the software that generated the content, as the credential declares it.
   */
  public On_AssetProvenance generatorName() {
    _add_field("generatorName");
    return this;
  }
  /**
   * **BETA** Version of the generating software, as the credential declares it.
   */
  public On_AssetProvenance generatorVersion() {
    _add_field("generatorVersion");
    return this;
  }
  /**
   * **BETA** Issuer of the signing certificate.
   */
  public On_AssetProvenance certIssuer() {
    _add_field("certIssuer");
    return this;
  }
  /**
   * **BETA** When the signing certificate was issued.
   */
  public On_AssetProvenance certIssuedAt() {
    _add_field("certIssuedAt");
    return this;
  }
  /**
   * **BETA** When the signing certificate expires.
   */
  public On_AssetProvenance certExpiresAt() {
    _add_field("certExpiresAt");
    return this;
  }
}
