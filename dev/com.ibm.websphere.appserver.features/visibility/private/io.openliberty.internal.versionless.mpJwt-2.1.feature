-include= ~${workspace}/cnf/resources/bnd/feature.props
symbolicName=io.openliberty.internal.versionless.mpJwt-2.1
visibility=private
singleton=true
-features= \
    io.openliberty.noShip-1.0, \
    io.openliberty.internal.mpVersion-6.0; ibm.tolerates:="6.1", \
    io.openliberty.mpJwt-2.1
kind=noship
edition=full
